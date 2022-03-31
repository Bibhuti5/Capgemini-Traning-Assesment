String.prototype.repeat = String.prototype.repeat || function(n){
    n= n || 1;
    return Array(n+1).join(this);
  }
  console.log('x'.repeat(5) );
  console.log('-'.repeat(7));