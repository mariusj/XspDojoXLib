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
		description = "Gives dynamic feedback on the progress of a long-running operation", 
		displayName = "Dojo ProgressBar", 
		tagName = "dxProgressBar",
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget",
		componentFamily = "javax.faces.Panel",
		paletteCategory = "Extlib DojoX"
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.DojoWidgetRenderer",
		dojoModule = "dijit.ProgressBar",
		defaultDojoType = "dijit.ProgressBar",
		tagName = "div"
)
public abstract class ProgressBar extends UIDojoWidget {

    @XspProperty(
    		description = "label on progress bar", 
    		displayName = "Label",
    		category = "dojo-widget"
	)
	protected String label;
    
    @XspProperty(
    		description = "number or percentage indicating amount of task completed", 
    		displayName = "value",
    		category = "dojo-widget"
	)
	protected String value;
    
    @XspProperty(
    		description = "maximum value", 
    		displayName = "maximum",
    		category = "dojo-widget"
	)
	protected Float maximum;
    
    @XspProperty(
    		description = "Number of places to show in values; 0 by default", 
    		displayName = "places",
    		category = "dojo-widget"
	)
	protected Integer places;
    
	
}
