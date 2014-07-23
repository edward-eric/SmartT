
<html>
<head>
		
	<title>Welcome to SmartT</title>
	
	
	
	<script type="text/javascript">

    var dojoBase = "/demo111/scripts";
    
    dojoConfig = {
        parseOnLoad: false,
        async: true,
        packages: [
            { name: "dojox", location: "../dojox" },
            { name: "dijit", location: "../dijit" }
        ]
    };
    document.write('<scr'+'ipt src="'+dojoBase+'/dojo/dojo.js"></scr'+'ipt>');
    document.write('<link rel="stylesheet" href="'+dojoBase+'/dijit/themes/claro/claro.css" />');
    document.write('<link rel="stylesheet" href="'+dojoBase+'/common/themes/mainFrame.css" />');


    </script>
    
    
    <script type="text/javascript">
		require([
			"dojo/parser",
			"dijit/layout/ContentPane",
			"dijit/layout/LayoutContainer",
			"common/widgets/toolbar",
			"common/widgets/leftpanel",
			"common/widgets/centerPanel",
			"dojo/domReady!"
		], function(parser){
			parser.parse();
		});
	</script>
</head>
<body class="claro">

   <div dojoType="dijit/layout/LayoutContainer" id="layoutContainer" style="height: 100%; width: 100%">

    <div dojoType="dijit/layout/ContentPane" 
         id="topContainer" 
         splitter=true 
         region="top">
        <div dojoType="common.widgets.toolbar"></div>
    </div>

    <div dojoType="dijit/layout/ContentPane" 
         id="leftContainer" 
         splitter=true 
         region="left"
		 style="width: 20%;">
        <div dojoType="common/widgets/leftpanel"></div>
    </div>
   
    <div dojoType="dijit/layout/ContentPane" 
         id="bottomContainer" 
         splitter=true 
         region="bottom" >
        bottom
    </div>
    
    <div dojoType="dijit/layout/ContentPane" 
         id="centerContainer" 
         splitter=true 
         region="center" >
        <div dojoType="common/widgets/centerPanel"></div>
    </div>

   </div>
   
   
	
</body>
</html>