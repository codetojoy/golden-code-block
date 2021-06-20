clang++ example.cpp

./a.out | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"
