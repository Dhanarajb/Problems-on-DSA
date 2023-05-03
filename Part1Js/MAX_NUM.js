const MAX_NUM = (arr) => {
  let max = arr[0];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  console.log(max);
};
console.log(MAX_NUM([1, 2, 36, 5, 4, 3, 2]));
