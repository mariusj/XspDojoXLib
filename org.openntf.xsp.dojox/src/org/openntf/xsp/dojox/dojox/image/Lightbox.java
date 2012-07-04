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
import org.openntf.xsp.annotations.XspGenProperty;

import com.ibm.xsp.component.xp.XspOutputLink;

@XspGenComponent(
		description = "An Elegant, keyboard accessible, markup and store capable " +
				"Lightbox widget to show images in a modal dialog-esque format. " +
				"Can show individual images as Modal dialog, or can group images " +
				"with multiple entry points, all using a single \"master\" Dialog " +
				"for visualization key controls: ESC - close Down Arrow / Rt Arrow " +
				"/ N - Next Image Up Arrow / Lf Arrow / P - Previous Image", 
		displayName = "Dojo Lightbox", 
		componentFamily = "javax.faces.Output",
		baseComponentType = "com.ibm.xsp.UIOutputLink", 
		tagName = "dxLightbox",
		paletteCategory = "Extlib DojoX"
)
public abstract class Lightbox extends XspOutputLink {

    @XspGenProperty(
    		description = "Grouping images in a page with similar tags will provide " +
    				"a 'slideshow' like grouping of images", 
    		displayName = "Group",
    		category = "dojo-widget"
	)
	protected String group;
    
}
