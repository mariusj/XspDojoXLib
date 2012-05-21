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

package org.openntf.xsp.dojox.dojox.image;

import org.openntf.xsp.annotations.XspComponent;
import org.openntf.xsp.annotations.XspDojoRenderer;
import org.openntf.xsp.annotations.XspProperty;

import com.ibm.xsp.extlib.component.dojo.UIDojoWidget;


@XspComponent(
		displayName = "Dojo Slideshow", 
		description = "Widget that displays a series of thumbnail sized images, for quick browsing and selection, and a single large image", 
		tagName = "dxSlideshow",
		paletteCategory = "Extlib DojoX", 
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget", 
		componentFamily = "javax.faces.Panel" 
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.layout.DojoLayoutRenderer",
		dojoModule = "dojox.image.SlideShow",
		defaultDojoType = "dojox.image.SlideShow",
		css = { "/.ibmxspres/dojoroot/dojox/image/resources/image.css" }
)
public abstract class Slideshow extends UIDojoWidget {

	protected Boolean noLink;
	
	protected Boolean loop;
	
	protected Boolean hasNav;
	
	protected Integer pageSize;
	
	protected Boolean autoLoad;
	
    @XspProperty(
    		description = "If true, the SlideShow begins playing immediately", 
    		displayName = "Auto start",
    		category = "dojo-widget"
	)
	protected Boolean autoStart;
	
	protected Boolean fixedHeight;
	
	protected String linkAttr;
	
	protected String imageLargeAttr;
	
	protected String titleAttr;
	
    @XspProperty(
    		description = "Time, in seconds, between image transitions during a slideshow.", 
    		displayName = "SlideshowInterval",
    		category = "dojo-widget"
	)
	protected Integer slideshowInterval;
}
