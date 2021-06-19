#!/bin/bash

set -e

tsc example.ts
node example.js | tee tmp.log
diff ../golden.master.out.log tmp.log
echo "diff result $?"
