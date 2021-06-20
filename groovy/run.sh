#!/bin/bash

set -e

groovy Example.groovy | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result $?"

