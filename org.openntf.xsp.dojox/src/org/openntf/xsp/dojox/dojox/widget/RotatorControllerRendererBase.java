/*
 * © Copyright Mariusz Jakubowski 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package org.openntf.xsp.dojox.dojox.widget;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.ibm.xsp.dojo.FacesDojoComponent;
import com.ibm.xsp.extlib.renderkit.dojo.DojoRendererUtil;
import com.ibm.xsp.extlib.renderkit.dojo.DojoWidgetRenderer;


public abstract class RotatorControllerRendererBase extends DojoWidgetRenderer {

	@Override
	protected void initDojoAttributes(FacesContext context,
			FacesDojoComponent dojoComponent, Map<String, String> attrs)
			throws IOException {
		super.initDojoAttributes(context, dojoComponent, attrs);
		if (dojoComponent instanceof RotatorControllerImpl) {
			RotatorControllerImpl c = (RotatorControllerImpl) dojoComponent;
			DojoRendererUtil.addDojoHtmlAttributes(attrs, "commands", join(c.getCommands(), ",")); //$NON-NLS-1$ //$NON-NLS-2$
		}

	}
	
    public static String join(Collection<?> s, String delimiter) {
        StringBuilder buffer = new StringBuilder();
        Iterator<?> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }

}
