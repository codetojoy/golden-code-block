gcc example.c

./a.out | tee tmp.log
diff tmp.log ../resources/golden.master.out.log
echo "diff result: $?"
