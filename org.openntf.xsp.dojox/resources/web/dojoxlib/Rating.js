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
dojo.provide("dojoxlib.Rating");

dojo.require("dojox.form.Rating");

dojo.declare(
	"dojoxlib.Rating",
	[dojox.form.Rating],
	{
		
		constructor:function(/*Object*/params){
			// Build the templateString. The number of stars is given by this.numStars,
			// which is normally an attribute to the widget node.
			dojo.mixin(this, params);
			
			var tpl = '<div dojoAttachPoint="domNode" class="dojoxRating dijitInline">' +
						'<input type="hidden" name=${name} value="0" dojoAttachPoint="focusNode" />' +
						'<ul>${stars}</ul>' +
					'</div>';
			// The value-attribute is used to "read" the value for processing in the widget class
			var starTpl = '<li class="dojoxRatingStar dijitInline" dojoAttachEvent="onclick:onStarClick,onmouseover:_onMouse,onmouseout:_onMouse" value="${value}"></li>';
			var rendered = "";
			for(var i = 0; i < this.numStars; i++){
				rendered += dojo.string.substitute(starTpl, {value:i+1});
			}
			this.templateString = dojo.string.substitute(tpl, {stars:rendered, name: "${name}"});
		},
		
		postCreate: function(){
			this.inherited(arguments);
			dojo.connect(this.domNode, "onmouseleave", this, "_onMouseLeave");
		},
		
		_onMouseLeave: function() {
			this.hovering = false;
			this._renderStars(this.value);
		}
		
		
	}
);

