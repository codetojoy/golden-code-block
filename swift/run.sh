#!/bin/bash

set -e

swift package clean
swift build
.build/debug/swift | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"

