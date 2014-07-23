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
        "dojo/text!./centerPanel.html",
        "dijit/Tooltip",
        "dijit/Toolbar",
        "dijit/ToolbarSeparator",
		"dijit/layout/BorderContainer",
		"dijit/layout/AccordionPane",
		"dijit/TitlePane",
        "dojo/domReady!"
], function (declare, lang, on, domClass, i18n, _TemplatedMixin, _WidgetBase, _WidgetsInTemplateMixin, template) {
        var centerPanel = declare("common.widgets.centerPanel", [ _WidgetBase, _TemplatedMixin, _WidgetsInTemplateMixin], {
            templateString: template,

            postCreate:function () {
                
            	console.log("into post create centerPanel.");
               
            },

            startup: function(){
                
            	console.log("into start up centerPanel");
            },

        });

        return centerPanel;
});