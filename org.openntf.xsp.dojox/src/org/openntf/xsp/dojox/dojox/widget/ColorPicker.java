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

import org.openntf.xsp.annotations.XspComponent;
import org.openntf.xsp.annotations.XspDojoRenderer;
import org.openntf.xsp.annotations.XspProperty;

import com.ibm.xsp.extlib.component.dojo.form.UIDojoFormWidgetBase;


@XspComponent(
		description = "A Photoshop-like HSV ColorPicker widget.", 
		displayName = "Dojo Color Picker", 
		tagName = "dxColorPicker",
		baseComponentType = "com.ibm.xsp.extlib.dojo.form.FormWidgetBase",
		componentFamily = "javax.faces.Input",
		paletteCategory = "Extlib DojoX"
)
@XspDojoRenderer(
		baseClass = "ColorPickerRendererBase",
		dojoModule = "dojox.widget.ColorPicker",
		defaultDojoType = "dojox.widget.ColorPicker",
		css = { "/.ibmxspres/dojoroot/dojox/widget/ColorPicker/ColorPicker.css" },
		tagName = "div"
)
public abstract class ColorPicker extends UIDojoFormWidgetBase {
	
    @XspProperty(
    		description = "show/update RGB input nodes", 
    		displayName = "showRgb", 
    		category = "dojo-widget"
	)
	protected Boolean showRgb;
	
    @XspProperty(
    		description = "show/update HSV input nodes", 
    		displayName = "showHsv", 
    		category = "dojo-widget"
	)
	protected Boolean showHsv;

    @XspProperty(
    		description = "show/update Hex input nodes", 
    		displayName = "showHex", 
    		category = "dojo-widget"
	)
	protected Boolean showHex;
    
    @XspProperty(
    		description = "Set to true to fire onChange in an indeterminate way", 
    		displayName = "liveUpdate", 
    		category = "dojo-widget"
	)
	protected Boolean liveUpdate;
    
}
