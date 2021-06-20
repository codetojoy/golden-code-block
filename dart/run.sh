#!/bin/bash

set -e

dart example.dart | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"
