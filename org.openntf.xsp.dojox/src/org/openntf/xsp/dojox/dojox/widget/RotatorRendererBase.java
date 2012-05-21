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

import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.ibm.xsp.dojo.FacesDojoComponent;
import com.ibm.xsp.extlib.renderkit.dojo.layout.DojoLayoutRenderer;
import com.ibm.xsp.resource.DojoModuleResource;
import com.ibm.xsp.resource.Resource;


public abstract class RotatorRendererBase extends DojoLayoutRenderer {

	private static Map<String, DojoModuleResource> transitionResources = new HashMap<String, DojoModuleResource>();
	
	static {
		transitionResources.put("dojox.widget.rotator.fade", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Fade")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.crossFade", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Fade")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.pan", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Pan")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.panDown", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Pan")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.panLeft", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Pan")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.panRight", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Pan")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.panUp", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Pan")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.slideDown", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Slide")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.slideLeft", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Slide")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.slideRight", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Slide")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.slideUp", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Slide")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.wipeDown", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Wipe")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.wipeLeft", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Wipe")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.wipeRight", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Wipe")); //$NON-NLS-1$
		transitionResources.put("dojox.widget.rotator.wipeUp", //$NON-NLS-1$
				new DojoModuleResource("dojox.widget.rotator.Wipe")); //$NON-NLS-1$
	}
	
	
	@Override
	protected Resource[] getExtraResources(FacesContext context,
			FacesDojoComponent component) {
		if (component instanceof RotatorImpl) {
			RotatorImpl c = (RotatorImpl) component;
			if (transitionResources.containsKey(c.getTransition())) {
				return new Resource[] { transitionResources.get(c.getTransition()) };
			}
		}
		return null;
	}
	
}
