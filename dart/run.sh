#!/bin/bash

set -e

dart example.dart | tee tmp.log
diff tmp.log ../golden.master.out.log
echo "diff result: $?"
