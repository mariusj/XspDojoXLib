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

import org.openntf.xsp.annotations.XspGenComponent;
import org.openntf.xsp.annotations.XspGenDojoRenderer;
import org.openntf.xsp.annotations.XspGenProperty;


@XspGenComponent(
		description = "Adds automatic rotating to the dojox.widget.Rotator.", 
		displayName = "Dojo AutoRotator", 
		smallIcon = "dojox/designer/icons/DojoAutoRotator_16.png",
		largeIcon = "dojox/designer/icons/DojoAutoRotator_24.png",
		baseComponentType = "org.openntf.xsp.dojox.dojox.widget.Rotator", 
		componentFamily = "javax.faces.Panel", 
		tagName = "dxAutoRotator",
		paletteCategory = "Extlib DojoX"
)
@XspGenDojoRenderer(
		baseClass = "RotatorRenderer",
		dojoModule = "dojox.widget.AutoRotator",
		defaultDojoType = "dojox.widget.AutoRotator"
)
public abstract class AutoRotator extends RotatorImpl {

    @XspGenProperty(
    		description = "Pause the rotator when the mouse hovers over it.", 
    		displayName = "Suspend on Hover",
    		category = "dojo-widget"
	)
	protected Boolean suspendOnHover;

    @XspGenProperty(
    		description = "The time in milliseconds before transitioning to the next pane. The default value is 4000 (4 seconds).", 
    		displayName = "Duration",
    		category = "dojo-widget"
	)
    protected Integer duration;

    @XspGenProperty(
    		description = "Starts the timer to transition children upon creation.", 
    		displayName = "Auto Start",
    		category = "dojo-widget"
	)
    protected Boolean autoStart;

    @XspGenProperty(
    		description = "Pause the rotator when the pane is changed or a controller's next or previous buttons are clicked.", 
    		displayName = "Pause on Manual Change",
    		category = "dojo-widget"
	)
    protected Boolean pauseOnManualChange;

    @XspGenProperty(
    		description = "Number of cycles before pausing.", 
    		displayName = "Cycles",
    		category = "dojo-widget"
	)
    Integer cycles;

    @XspGenProperty(
    		description = "Determines if the panes should cycle randomly.", 
    		displayName = "Random",
    		category = "dojo-widget"
	)
    protected Boolean random;

    @XspGenProperty(
    		description = "Causes the rotator to rotate in reverse order.", 
    		displayName = "Reverse",
    		category = "dojo-widget"
	)
    protected Boolean reverse;
	
}
