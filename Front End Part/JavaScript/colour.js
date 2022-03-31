var colourChanger = document.getElementsById("colour-changer");
var colours=["red","blue","green","pink"];
var counter = 0;
function changeColour(){
    colourChanger.style.backgroud = colours[counter];
    counter ++;
}
 
setInterval(changeColour,3000);