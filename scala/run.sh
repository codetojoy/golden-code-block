#!/bin/bash

set -e

scalac Example.scala
scala Example | tee tmp.log
diff tmp.log ../golden.master.out.log
echo "diff result: $?"

