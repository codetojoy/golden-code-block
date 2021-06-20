#!/bin/bash

set -e 

dotnet run -p csharp.csproj | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"
