#!/bin/bash

set -e

kotlinc Example.kt
kotlin ExampleKt | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"

