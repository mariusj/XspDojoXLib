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

package org.openntf.xsp.dojox.dojox.form;

import org.openntf.xsp.annotations.XspComponent;
import org.openntf.xsp.annotations.XspDojoRenderer;
import org.openntf.xsp.annotations.XspProperty;

import com.ibm.xsp.extlib.component.dojo.form.UIDojoButton;


@XspComponent(
		description = "A Button with progress indicator built in, for indicating processing after you press the button", 
		displayName = "Dojo BusyButton", 
		tagName = "dxBusyButton",
		componentFamily = "javax.faces.Input",
		baseComponentType = "com.ibm.xsp.extlib.dojo.form.Button",
		paletteCategory = "Extlib DojoX"
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.form.DojoButtonRenderer",
		dojoModule = "dojox.form.BusyButton",
		defaultDojoType = "dojox.form.BusyButton",
		css = { "/.ibmxspres/dojoroot/dojox/form/resources/BusyButton.css" }
)
public abstract class BusyButton extends UIDojoButton {

    @XspProperty(
    		description = "text while button is busy", 
    		displayName = "Busy Label",
    		category = "dojo-widget"
	)
	protected String busyLabel;
    
    @XspProperty(
    		description = "use a busy icon", 
    		displayName = "Use Busy Icon",
    		category = "dojo-widget"
	)
    protected Boolean useIcon;
    
}
