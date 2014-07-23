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
        "dojo/text!./toolbar.html",
        "dijit/Tooltip",
        "dijit/Toolbar",
        "dijit/ToolbarSeparator",
        "dojo/domReady!"
], function (declare, lang, on, domClass, i18n, _TemplatedMixin, _WidgetBase, _WidgetsInTemplateMixin, template) {
        var toolbar = declare("common.widgets.toolbar", [ _WidgetBase, _TemplatedMixin, _WidgetsInTemplateMixin], {
            templateString: template,

            postCreate:function () {
                
            	console.log("into post create.");
               
            },

            startup: function(){
                
            	console.log("into start up");
            },

        });

        return toolbar;
});