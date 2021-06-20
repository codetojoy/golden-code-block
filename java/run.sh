#!/bin/bash

set -e

javac Example.java
java -cp . Example | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"
