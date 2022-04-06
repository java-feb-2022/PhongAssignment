// var myArr = [23,12];
// console.log(myArr.length); 

function moveToFront(arr, val)
{
    //move one over
    //hold onto value in index 2
    var hold1=arr[0], hold2=arr[1]; 
    for (var i=0; i<arr.length && hold1 !=undefined; i++){
        arr[i+1]=hold1;
        hold1=hold2; 
        hold2=arr[i+2];
    }
    arr[0]=val; //put in the new value 

}
//test 
var testarray=[5,6,7,8]; 
moveToFront(testarray, 9)
console.log(testarray); 

var testarray2=[5]; 
moveToFront(testarray2, 9);
console.log(testarray2); 

var testarray3=[]; 
moveToFront(testarray3, 9);
console.log(testarray3); 


 
 
//going backwards
function moveToFront2(arr, val) {
    // Loop backwards 
    for (var i = arr.length - 1; i >= 0; i--) {
        arr[i+1] = arr[i];
    }
    arr[0] = val; // Put value in at start of array
}

//test backwards

var backarr=[4,5,6,7];
moveToFront2(backarr, 8);
console.log(backarr); 

var backarr2=[];
moveToFront2(backarr2, 8);
console.log(backarr2); 



 function popFront(arr) {
    var returnVal = arr[0]; // The value we will return. That kicks out as ou move to left.
    // Loop through the array - starting at index 1
    for (var i = 1; i < arr.length; i++) {
        // i = 1: arr[0] = arr[1] -> arr[i-1] = arr[i]
        arr[i-1] = arr[i];
    }
    arr.pop(); // Remove the last value
    return returnVal;
}

//test case 

var testa=[3,3,0,1]; 
var resulta=popFront(testa); 
console.log(testa);
console.log(resulta); 

var testb=[1]; 
var resultb=popFront(testb); 
console.log(testb);
console.log(resultb); 



function insertAt(arr, val, index) {
    // Loop backwards - moving values to the right - stopping at the index where we're inserting new value
    for (var i = arr.length - 1; i >= index; i--) {
        arr[i+1] = arr[i];
    }
    arr[index] = val; // Put value in at specified index
}

var testaa=[4,6,5,75,92];
 
insertAt(testaa, 1000, 2); 
console.log(testaa); 


var testab=[12];
 
insertAt(testab, 99, 10); 
console.log(testab); 


function removeAt(arr, ind) {
    ind = Math.floor(ind); // Rounds the index down
    // If index is out of bounds
    if (ind >= arr.length || ind < 0) {
        return null; // Return an arbitrary value
    }
    var returnVal = arr[ind]; // The value we will return
    // Loop through the array - starting at the index after the one whose value will be removed
    for (var i = ind + 1; i < arr.length; i++) {
        arr[i-1] = arr[i];
    }
    arr.pop();  
    // arr.length--; // Alternate way to remove last value
    return returnVal;
}

var testremoveArr=[1];
var resultc=removeAt(testremoveArr, 0); 
console.log(testremoveArr); 
console.log(resultc); 

function swapPairs(arr) {
    for (var i = 0; i < arr.length - 1; i += 2) {
        // Swap pairs:
        var temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
 