webix.ready(function(){
    webix.ui({
        container:"layout",
        height:500, width:300,
        rows:[
            {template:"Hi there!"},
            {template:"You're doing great!"}
        ]
    });
});