set -e

javac AgeCalc.java

for TEST in test-files/test*.txt
do
  echo Testing `cat $TEST`
  result=`java AgeCalc < $TEST`
  if [[ $result == `cat $TEST.expect` ]]
  then
    echo "Success!"
  else
    echo "Fail, these two strings are not equal:"
    echo "Expect:" `cat $TEST.expect`
    echo "Actual:" $result
  fi
done

