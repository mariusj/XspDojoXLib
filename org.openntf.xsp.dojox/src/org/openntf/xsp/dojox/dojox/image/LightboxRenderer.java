/*
 * � Copyright Mariusz Jakubowski 2012
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

package org.openntf.xsp.dojox.dojox.image;


import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.ibm.xsp.ajax.AjaxUtil;
import com.ibm.xsp.component.UIViewRootEx;
import com.ibm.xsp.renderkit.html_extended.LinkRendererEx;
import com.ibm.xsp.resource.DojoModuleResource;
import com.ibm.xsp.resource.StyleSheetResource;


public class LightboxRenderer extends LinkRendererEx {

	public static final DojoModuleResource dojoxImageLightbox = new DojoModuleResource(
			"dojox.image.Lightbox"); //$NON-NLS-1$
	
	public static final StyleSheetResource dojoxImageLightboxCss = new StyleSheetResource(
			"/.ibmxspres/dojoroot/dojox/image/resources/Lightbox.css");

	@Override
	public void encodeBegin(FacesContext context, UIComponent component)
			throws IOException {
		super.encodeBegin(context, component);
		ResponseWriter w = context.getResponseWriter();
		if (AjaxUtil.isAjaxNullResponseWriter(w))
			return;
		LightboxImpl lbox = (LightboxImpl) component;
		w.writeAttribute("dojoType", "dojox.image.Lightbox", null);
		w.writeAttribute("group", lbox.getGroup(), null);
		UIViewRootEx viewEx = (UIViewRootEx)context.getViewRoot();
		viewEx.addEncodeResource(dojoxImageLightbox);
		viewEx.addEncodeResource(dojoxImageLightboxCss);
	}

}
