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

package org.openntf.xsp.dojox.dijit;

import org.openntf.xsp.annotations.XspComponent;
import org.openntf.xsp.annotations.XspDojoRenderer;
import org.openntf.xsp.annotations.XspProperty;

import com.ibm.xsp.extlib.component.dojo.UIDojoWidget;


@XspComponent(
		description = "Displays a color picker", 
		displayName = "Dojo Color Pallete", 
		tagName = "dxColorPalette",
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget",
		componentFamily = "javax.faces.Panel",
		paletteCategory = "Extlib DojoX"
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.DojoWidgetRenderer",
		dojoModule = "dijit.ColorPalette",
		defaultDojoType = "dijit.ColorPalette",
		tagName = "div"
)
public abstract class ColorPalette extends UIDojoWidget {
	
    @XspProperty(
    		description = "A string defining the size of the palette", 
    		displayName = "Palette", 
    		category = "dojo-widget",
    		editor = "com.ibm.workplace.designer.property.editors.comboParameterEditor",
    		editorParameter = "7x10\n3x4"
	)
	protected String palette;
}
