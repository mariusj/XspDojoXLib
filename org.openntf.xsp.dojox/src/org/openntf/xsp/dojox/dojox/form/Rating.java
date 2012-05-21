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

import com.ibm.xsp.extlib.component.dojo.form.UIDojoFormWidgetBase;


@XspComponent(
		description = "This widget allows users to rate items", 
		displayName = "Dojo Rating", 
		tagName = "dxRating",
		componentFamily = "javax.faces.Input",
		baseComponentType = "com.ibm.xsp.extlib.dojo.form.FormWidgetBase",
		paletteCategory = "Extlib DojoX"
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.form.DojoFormWidgetRenderer",
		dojoModule = "dojoxlib.Rating",
		defaultDojoType = "dojoxlib.Rating",
		css = { "/.ibmxspres/dojoroot/dojox/form/resources/Rating.css" }
)
public abstract class Rating extends UIDojoFormWidgetBase {

    @XspProperty(
    		description = "The number of stars to show, default is 3", 
    		displayName = "Num Stars",
    		category = "dojo-widget"
	)
	protected Integer numStars;
    
}
