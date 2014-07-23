/**
 * IBM Confidential
 * OCO Source Materials
 *
 * (c) Copyright IBM Corp 2014.
 * The source code for this program is not published or otherwise divested of its trade secrets,
 *   irrespective of what has been deposited with the U.S. Copyright Office.
 **/
define([
        "dojo/_base/declare",
        "dojo/_base/lang",
        "dojo/on",
        "dojo/dom-class",
        "dojo/i18n",
        "dijit/_TemplatedMixin",
        "dijit/_WidgetBase",
        "dijit/_WidgetsInTemplateMixin",
        "dojo/text!./leftpanel.html",
		"dijit/Tree",
		"dojo/store/JsonRest",
        "dijit/Tooltip",
        "dijit/Toolbar",
        "dijit/ToolbarSeparator",
		"dijit/layout/LayoutContainer",
		"dijit/layout/ContentPane",
		"dijit/TitlePane",
        "dojo/domReady!"
], function (declare, lang, on, domClass, i18n, _TemplatedMixin, _WidgetBase, _WidgetsInTemplateMixin, template, Tree, JsonRest) {
        var leftpanel = declare("common.widgets.leftpanel", [ _WidgetBase, _TemplatedMixin, _WidgetsInTemplateMixin], {
            templateString: template,
			_resources: i18n.getLocalization("common", "smartResources"),

            postCreate:function () {
            	console.debug("into post create leftpanel.");
				this.navigateInsidePane.set("title", this._resources.allZone);
				this.createInitialList();
            },
			
			createInitialList: function(){
			
			var commandStore = new JsonRest({
			    target: "http://localhost:8080/demo111/services/myservices/commandTree/",
				id: "id",
				getRoot: function(onItem, onError){
                   this.get("0").then(onItem, onError);
                },
				getLabel: function(object){
                   return object.name;
                },
				mayHaveChildren: function(object){
                   return "commands" in object;
                },
				getChildren: function(object, onComplete, onError){
                   this.get(object.id).then(function(fullObject){
                      object.commands = fullObject.commands;
                      onComplete(fullObject.commands);
                   }, onError);
                }
			});
	
	var tree = new Tree({
        model: commandStore
    });
	
	tree.placeAt(this.navigateInsidePane);
    tree.startup();
			},

            startup: function(){}

        });

        return leftpanel;
});