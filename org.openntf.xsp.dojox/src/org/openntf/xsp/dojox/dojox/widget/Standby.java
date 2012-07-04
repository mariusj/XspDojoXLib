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

import com.ibm.xsp.extlib.component.dojo.UIDojoWidget;


@XspGenComponent(
		displayName = "Dojo Standby", 
		description = "A widget designed to act as a Standby/Busy/Disable/Blocking widget to indicate a particular DOM node is processing and cannot be clicked on at this time.", 
		tagName = "dxStandby",
		paletteCategory = "Extlib DojoX", 
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget", 
		componentFamily = "javax.faces.Panel" 
)
@XspGenDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.layout.DojoLayoutRenderer",
		dojoModule = "dojox.widget.Standby",
		defaultDojoType = "dojox.widget.Standby",
		css = "/.ibmxspres/dojoroot/dojox/widget/Standby/Standby.css"
)
public abstract class Standby extends UIDojoWidget {

    @XspGenProperty(
    		description = "A URL to an image to center within the blocking overlay. The default is a basic spinner.", 
    		displayName = "Image",
    		category = "dojo-widget"    		
	)
    protected String image;
    
    @XspGenProperty(
    		description = "Text to set on the ALT tag of the image. The default is 'Please wait...'", 
    		displayName = "imageText",
    		category = "dojo-widget"    		
	)
    protected String imageText;
    
    @XspGenProperty(
    		description = "Text to display in the center instead of an image.  The default is 'Please wait...'", 
    		displayName = "text",
    		category = "dojo-widget"    		
	)
    protected String text;
    
    @XspGenProperty(
    		description = "Which to use as the center info, the text or the image. Defaults to image.", 
    		displayName = "centerIndicator",
    		category = "dojo-widget"    		
	)
    protected String centerIndicator;
    
    @XspGenProperty(
    		description = "The color to use for the translucent overlay.", 
    		displayName = "color",
    		category = "dojo-widget"    		
	)
    protected String color;
    
    @XspGenProperty(
    		description = "How long the fade in and out effects should run in milliseconds.", 
    		displayName = "duration",
    		category = "dojo-widget"    		
	)
    protected Integer duration;    
    
    @XspGenProperty(
    		description = "Control that lets you specify if the zIndex for the overlay " +
    					  "should be auto-computed based off parent zIndex, or should be set " +
    					  "to a particular value.  This is useful when you want to overlay " +
    					  "things in digit.Dialogs, you can specify a base zIndex to append from. " +
    					  "Default is 'auto'.", 
    		displayName = "zIndex",
    		category = "dojo-widget"    		
	)
    protected String zIndex;
    
    
    @XspGenProperty(
    		description = "The target to overlay when active. Can be a widget id or a dom id", 
    		displayName = "target",
    		category = "dojo-widget"    		
	)
    protected String target;    
     
}
