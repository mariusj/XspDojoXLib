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
		displayName = "Dojo Rotator", 
		description = "A small, fast, extensible, awesome rotator that cycles, with transitions, through panes (child nodes) displaying only one at a time and ties into controllers used to change state.", 
		tagName = "dxRotator",
		smallIcon = "dojox/designer/icons/DojoRotator_16.png", 
		largeIcon = "dojox/designer/icons/DojoRotator_24.png", 
		paletteCategory = "Extlib DojoX", 
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget", 
		componentFamily = "javax.faces.Panel" 
)
@XspDojoRenderer(
		baseClass = "RotatorRendererBase",
		dojoModule = "dojox.widget.Rotator",
		defaultDojoType = "dojox.widget.Rotator"
)
public abstract class Rotator extends UIDojoWidget {

    @XspProperty(
    		description = "The name of a function that is passed two panes nodes and a duration, then returns a dojo.Animation object. The default value is \"dojox.widget.rotator.swap\"", 
    		displayName = "Transition", 
    		category = "dojo-widget",
    		editor = "com.ibm.workplace.designer.property.editors.comboParameterEditor",
    		editorParameter = "dojox.widget.rotator.swap|Swap\n" +
    				"dojox.widget.rotator.fade|Fade\n" +
    				"dojox.widget.rotator.crossFade|Cross Fade\n" +
    				"dojox.widget.rotator.pan|Pan\n" +
    				"dojox.widget.rotator.panDown|Pan Down\n" +
    				"dojox.widget.rotator.panLeft|Pan Left\n" +
    				"dojox.widget.rotator.panRight|Pan Right\n" +
    				"dojox.widget.rotator.panUp|Pan Up\n" +
    				"dojox.widget.rotator.slideDown|Slide Down\n" +
    				"dojox.widget.rotator.slideLeft|Slide Left\n" +
    				"dojox.widget.rotator.slideRight|Slide Right\n" +
    				"dojox.widget.rotator.slideUp|Slide Up\n" +
    				"dojox.widget.rotator.wipeDown|Wipe Down\n" + 
    				"dojox.widget.rotator.wipeLeft|Wipe Left\n" +
    				"dojox.widget.rotator.wipeRight|Wipe Right\n" +
    				"dojox.widget.rotator.wipeUp|Wipe Up"
	)
	protected String transition;
    
    @XspProperty(
    		description = "Parameters for the transition. The string is read in and eval'd as an object. If the duration is absent, the default value will be used.", 
    		displayName = "Transition Params",
    		category = "dojo-widget"
	)
    protected String transitionParams;
    
}
