#!/bin/bash

set -e

node example.js | tee tmp.log
diff ../resources/golden.master.out.log tmp.log
echo "diff result $?"
