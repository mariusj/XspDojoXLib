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

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.ibm.xsp.component.UIViewRootEx;
import com.ibm.xsp.extlib.renderkit.dojo.form.DojoFormWidgetRenderer;


public abstract class ColorPickerRendererBase extends DojoFormWidgetRenderer {

	@Override
	protected boolean needHiddenField() {
		return true;
	}
	
	@Override
	protected void renderJavaScriptBinding(FacesContext context,
			ResponseWriter writer, UIInput component) {
        StringBuilder sb = new StringBuilder();
        String clientId = component.getClientId(context);
        String name = getNameAttribute(context, component)+HIDDEN_SUFFIX;
        sb.append("dijit.byId('").append(clientId).append("').attr(\"value\", dojo.byId('").append(name).append("').value);\n"); // $NON-NLS-1$ $NON-NLS-2$ $NON-NLS-3$
        sb.append("dojo.connect(dijit.byId('").append(clientId).append("'),'onChange',function(){dojo.byId('").append(name).append("').value=dijit.byId('").append(clientId).append("').attr('value')});"); // $NON-NLS-1$ $NON-NLS-2$ $NON-NLS-3$ $NON-NLS-4$
        ((UIViewRootEx)context.getViewRoot()).addScriptOnLoad(sb.toString());
	}
	
    
}
