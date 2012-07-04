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

import org.openntf.xsp.annotations.XspGenComponent;
import org.openntf.xsp.annotations.XspGenDojoRenderer;
import org.openntf.xsp.annotations.XspGenProperty;

import com.ibm.xsp.extlib.component.dojo.UIDojoWidget;


@XspGenComponent(
		displayName = "Dojo ThumbnailPicker", 
		description = "Widget that displays a series of images either horizontally or vertically, with controls to page through the images.", 
		tagName = "dxThumbnailPicker",
		paletteCategory = "Extlib DojoX", 
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget", 
		componentFamily = "javax.faces.Panel" 
)
@XspGenDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.layout.DojoLayoutRenderer",
		dojoModule = "dojox.image.ThumbnailPicker",
		defaultDojoType = "dojox.image.ThumbnailPicker",
		css = { "/.ibmxspres/dojoroot/dojox/image/resources/image.css" }
)
public abstract class ThumbnailPicker extends UIDojoWidget {
    @XspGenProperty(
    		description = "Setting useLoadNotifier to true makes a colored DIV appear under each thumbnail image, which is used to display the loading status of each image in the data store.", 
    		displayName = "Use Load Notifier",
    		category = "dojo-widget"
	)
    protected Boolean useLoadNotifier;
    
    @XspGenProperty(
    		description = "Setting useHyperlink to true causes a click on a thumbnail to open a link.", 
    		displayName = "Use Hyperlink",
    		category = "dojo-widget"
	)
    protected Boolean useHyperlink;
    
    protected String hyperlinkTarget;
    
    protected Boolean isClickable;
    
    @XspGenProperty(
    		description = "When true, uses smoothScroll to move between pages ", 
    		displayName = "isScrollable",
    		defaultValue = "true",
    		category = "dojo-widget"
	)
    protected Boolean isScrollable;
    
    protected Boolean isHorizontal;
    
    protected Boolean autoLoad;
    
    protected String linkAttr;
    
    protected String imageThumbAttr;
    
    protected String imageLargeAttr;
    
    protected Integer pageSize;
    
    protected String titleAttr;
    
}
