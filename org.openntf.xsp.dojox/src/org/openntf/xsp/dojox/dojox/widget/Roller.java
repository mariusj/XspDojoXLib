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

import com.ibm.xsp.extlib.component.dojo.UIDojoWidget;


@XspComponent(
		displayName = "Dojo Roller", 
		description = "The Roller is a degradable, unobtrusive widget to convert an unordered list (<ul>) of styled items into a single item, and loop through the display.", 
		tagName = "dxRoller",
		paletteCategory = "Extlib DojoX", 
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget", 
		componentFamily = "javax.faces.Panel" 
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.layout.DojoLayoutRenderer",
		dojoModule = "dojox.widget.Roller",
		defaultDojoType = "dojox.widget.Roller",
		tagName = "ul"
)
public abstract class Roller extends UIDojoWidget {

    @XspProperty(
    		description = "Interval between rolls", 
    		displayName = "Delay",
    		category = "dojo-widget"    		
	)
    protected Integer delay;
    
    @XspProperty(
    		description = "Toggle to control starup behavior. Call .start() manually if set to `false`", 
    		displayName = "AutoStart",
    		category = "dojo-widget"    		
	)
    protected Boolean autoStart;
    
    @XspProperty(
    		description = "Speed (in ms) to apply to the 'in' animation (show the node)", 
    		displayName = "durationIn",
    		category = "dojo-widget"    		
	)
    protected Integer durationIn;
    
    @XspProperty(
    		description = "Speed (in ms) to apply to the 'out' animation (hide the showing node)", 
    		displayName = "durationOut",
    		category = "dojo-widget"    		
	)
    protected Integer durationOut;
    
}
