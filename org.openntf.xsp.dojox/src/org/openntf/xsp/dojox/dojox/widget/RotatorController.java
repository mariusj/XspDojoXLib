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

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import org.openntf.xsp.annotations.XspComponent;
import org.openntf.xsp.annotations.XspDojoRenderer;
import org.openntf.xsp.annotations.XspProperty;

import com.ibm.xsp.extlib.component.dojo.UIDojoWidget;
import com.ibm.xsp.util.StateHolderUtil;

@XspComponent(
		description = "Displays a series of controls that send actions to a Rotator or AutoRotator", 
		displayName = "Dojo Rotator Controller",
		smallIcon = "dojox/designer/icons/DojoRotatorController_16.png",
		largeIcon = "dojox/designer/icons/DojoRotatorController_24.png",
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget", 
		componentFamily = "javax.faces.Panel", 
		tagName = "dxRotatorController",
		paletteCategory = "Extlib DojoX"
)
@XspDojoRenderer(
		baseClass = "RotatorControllerRendererBase",
		dojoModule = "dojox.widget.rotator.Controller",
		defaultDojoType = "dojox.widget.rotator.Controller",
		tagName = "div"
)
public abstract class RotatorController extends UIDojoWidget {

    @XspProperty(
    		description = "The name of an instance of a Rotator widget defined by jsId.", 
    		displayName = "Rotator",
    		category = "dojo-widget"
	)
    protected String rotator;
    
    @XspProperty(
    		description = "A list of commands", 
    		displayName = "Commands",
    		category = "dojo-widget",
    		propertyAddMethod = "addCommand",
    		editor = "com.ibm.workplace.designer.property.editors.comboParameterEditor",
    		editorParameter = "prev|Previous\n" +
    				"next|Next\n" +
    				"prev|Previous\n" +
    				"play/pause|Play/Pause\n" +
    				"info|Info\n" +
    				"#|Numbers\n" +
    				"titles|Titles",
			dontGenerateCode = true
	)
    private List<String> commands;
    

    public List<String> getCommands() {
		return commands;
	}

	public void addCommand(String command) {
		if(commands==null) {
			commands = new ArrayList<String>();
		}
		commands.add(command);
	}
	
	// State management
	@Override
	public void restoreState(FacesContext _context, Object _state) {
		Object _values[] = (Object[]) _state;
		super.restoreState(_context, _values[0]);
		this.commands = StateHolderUtil.restoreList(_context, this, _values[1]);        
	}
	
	@Override
	public Object saveState(FacesContext _context) {
		Object _values[] = new Object[2];
		_values[0] = super.saveState(_context);
		_values[1] = StateHolderUtil.saveList(_context, commands, false);
		return _values;
	}

}
