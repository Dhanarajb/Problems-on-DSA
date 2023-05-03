const SEC_MAX = (arr) => {
  let First = 0;
  let Second = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > First) {
      First = arr[i];
    } else if (arr[i] > Second && arr[i] !== First) {
      Second = arr[i];
    }
  }
  console.log(Second);
};

const result = SEC_MAX([1, 2, 3, 2, 1, 6, 5, 4, 3, 4, 533, 2, 2, 4, 55]);
console.log(result);
