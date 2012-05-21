package org.openntf.xsp.dojox.dojox.layout;

import org.openntf.xsp.annotations.XspComponent;
import org.openntf.xsp.annotations.XspDojoRenderer;
import org.openntf.xsp.annotations.XspProperty;

import com.ibm.xsp.extlib.component.dojo.layout.UIDojoContentPane;

@XspComponent(
		displayName = "Dojo ExpandoPane", 
		description = "A collapsing-pane for dijit.layout.BorderContainer", 
		tagName = "dxExpandoPane",
		paletteCategory = "Extlib DojoX", 
		baseComponentType = "com.ibm.xsp.extlib.dojo.layout.ContentPane",
		componentFamily = "javax.faces.Panel" 
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.layout.DojoContentPaneRenderer",
		dojoModule = "dojox.layout.ExpandoPane",
		defaultDojoType = "dojox.layout.ExpandoPane",
		css = { "/.ibmxspres/dojoroot/dojox/layout/resources/ExpandoPane.css" }
)
public abstract class ExpandoPane extends UIDojoContentPane {
	
	@XspProperty(
    		description = "Easing function used to hide pane", 
    		displayName = "easeOut",
    		category = "dojo-widget"
	)
	protected String easeOut;

	@XspProperty(
    		description = "Easing function used to show pane", 
    		displayName = "easeIn",
    		category = "dojo-widget"
	)
	protected String easeIn;

	@XspProperty(
    		description = "duration to run show/hide animations", 
    		displayName = "duration",
    		category = "dojo-widget",
    		defaultValue = "420"
	)
	protected Integer duration;
	
	@XspProperty(
    		description = "Does this widget start in an open (true) or closed (false) state", 
    		displayName = "startExpanded",
    		category = "dojo-widget",
    		defaultValue = "true"
	)
	protected Boolean startExpanded;
	
	@XspProperty(
    		description = "A value from 0 .. 1 indicating the opacity to use on the container when only showing a preview", 
    		displayName = "previewOpacity",
    		category = "dojo-widget",
    		defaultValue = "0.75"
	)
	protected Float previewOpacity;
	
	@XspProperty(
    		description = "If true, will override the default behavior of a " +
    				"double-click calling a full toggle. If false, a double-click " +
    				"will cause the preview to popup", 
    		displayName = "previewOnDblClick",
    		category = "dojo-widget"
	)
	protected Boolean previewOnDblClick;
	
	@XspProperty(
    		description = "Specifies where to position this control within its parent container", 
    		displayName = "region",
    		editor = "com.ibm.workplace.designer.property.editors.comboParameterEditor",
    		editorParameter = "top\n" + "bottom\n" + 
    				"leading\n" + "trailing\n" + 
    				"left\n" + "right\n" + "center\n",
    		category = "dojo-widget"
	)
	protected String region;
	
}
