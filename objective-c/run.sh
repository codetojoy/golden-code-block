clang -framework Foundation main.m

./a.out | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"
