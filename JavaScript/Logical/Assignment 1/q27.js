const insertion_Sort = (nums) => {
    for (let i = 1; i < nums.length; i++) {
      let j = i - 1
      let temp = nums[i]
      while (j >= 0 && nums[j] > temp) {
        nums[j + 1] = nums[j]
        j--
      }
      nums[j+1] = temp
    }
    return nums
  }
document.write("insertion sort"+insertion_Sort([3, 0, 2, 5, -1, 4, 1])+"<br>");

function Selection_Sort(arr, compare_Function) {

    function compare(a, b) {
     return a - b;
     } 
    var min = 0;
    var index = 0;
    var temp = 0;
  
    compare_Function = compare_Function || compare;
  
    for (var i = 0; i < arr.length; i += 1) {
      index = i;
      min = arr[i];
  
      for (var j = i + 1; j < arr.length; j += 1) {
        if (compare_Function(min, arr[j]) > 0) {
          min = arr[j];
          index = j;
        }
      }
  
      temp = arr[i];
      arr[i] = min;
      arr[index] = temp;
    }
  
    return arr;
  }
document.write("selection sort"+ Selection_Sort([3, 0, 2, 5, -1, 4, 1], function(a, b) { return a - b; })+"<br>"); 
document.write("selection sort"+Selection_Sort([3, 0, 2, 5, -1, 4, 1], function(a, b) { return b - a; })+"<br>");

function merge_sort(left_part,right_part) 
{
	var i = 0;
	var j = 0;
	var results = [];

	while (i < left_part.length || j < right_part.length) {
		if (i === left_part.length) {
			results.push(right_part[j]);
			j++;
		} 
      else if (j === right_part.length || left_part[i] <= right_part[j]) {
			results.push(left_part[i]);
			i++;
		} else {
			results.push(right_part[j]);
			j++;
		}
	}
	return results;
}

document.write("merge sort"+merge_sort([1,3,4], [3,7,9])+"<br>");

function quick_Sort(origArray) {
	if (origArray.length <= 1) { 
		return origArray;
	} else {

		var left = [];
		var right = [];
		var newArray = [];
		var pivot = origArray.pop();
		var length = origArray.length;

		for (var i = 0; i < length; i++) {
			if (origArray[i] <= pivot) {
				left.push(origArray[i]);
			} else {
				right.push(origArray[i]);
			}
		}

		return newArray.concat(quick_Sort(left), pivot, quick_Sort(right));
	}
}

var myArray = [3, 0, 2, 5, -1, 4, 1 ];
document.write("Qucik sort"+"<br>")
document.write(" Original array: " + myArray + "<br>");
var sortedArray = quick_Sort(myArray);
document.write("Sorted array: " + sortedArray + "<br>");

function stoogesort(arr, l, h)
    {
        if (l >= h)
            return;

        if (arr[l] > arr[h]) {
            let t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
        }

        if (h - l + 1 > 2) {
            let t = parseInt((h - l + 1) / 3, 10);

            stoogesort(arr, l, h - t);

            stoogesort(arr, l + t, h);
  
            stoogesort(arr, l, h - t);
        }
    }
     
    let arr = [ 2, 4, 5, 3, 1 ];
    let n = arr.length;
 
    stoogesort(arr, 0, n - 1);

    document.write("Stooge sort");
    for (let i = 0; i < n; i++)
      document.write(arr[i] + " ");