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

package org.openntf.xsp.dojox.dojo;

import java.io.IOException;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.ibm.commons.util.StringUtil;
import com.ibm.xsp.component.UIViewRootEx;
import com.ibm.xsp.extlib.renderkit.dojo.form.DojoFormWidgetRenderer;

public abstract class InlineEditBoxRendererBase extends DojoFormWidgetRenderer {

	@Override
	protected boolean needHiddenField() {
		return true;
	}
	
	// DojoRendererUtil.addDojoHtmlAttributes(attrs, "autoSave", c.isAutoSave(), true);	//$NON-NLS-1$
	
	
	@Override
    protected void startTag(FacesContext context, ResponseWriter writer, UIInput component) throws IOException {
		InlineEditBoxImpl c = (InlineEditBoxImpl) component;
    	String tagName = c.getTagName();
        writer.startElement(tagName, component); //$NON-NLS-1$
    }

	@Override
    protected void endTag(FacesContext context, ResponseWriter writer, UIInput component) throws IOException {
		InlineEditBoxImpl c = (InlineEditBoxImpl) component;
    	String tagName = c.getTagName();
        writer.endElement(tagName); 
    }
	
	@Override
	protected void renderTagBody(FacesContext context, UIInput component,
			ResponseWriter writer, String currentValue) throws IOException {
		currentValue = getCurrentValue(context, component);
		if (StringUtil.isNotEmpty(currentValue))
			writer.write(currentValue);
	}
	
    @Override
	protected void renderJavaScriptBinding(FacesContext context, ResponseWriter writer, UIInput component) {
    	StringBuilder sb = new StringBuilder();
        String clientId = component.getClientId(context);
        String name = getNameAttribute(context, component)+HIDDEN_SUFFIX;
        sb.append("dojo.connect(dijit.byId('").append(clientId).	//$NON-NLS-1$
        	append("'),'save',function(value){dojo.byId('").append(name). //$NON-NLS-1$
        	append("').value=this.attr('value')});"); //$NON-NLS-1$
    	((UIViewRootEx)context.getViewRoot()).addScriptOnLoad(sb.toString());
    }
    
    @Override
    protected boolean needDecode() {
    	return true;
    }
    
}
