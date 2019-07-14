# hackerrank_SockMerchant
https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&amp;playlist_slugs%5B%5D=interview-preparation-kit&amp;playlist_slugs%5B%5D=warmup

# The Problem
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there  <b><u>n = 7</u></b> socks with colors <b><u>ar = [1,2,1,2,1,3,2]</u></b>. There is one pair of color <b><u>1</u></b> and one of color <b><u>2</u></b>. There are three odd socks left, one of each color. The number of pairs is <b><u>2</u></b>.


### Function Description

Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):
 - n: the number of socks in the pile
 - ar: the colors of each sock

### Input Format

The first line contains an integer <b><u>n</u></b>, the number of socks represented in <b><u>ar</u></b>.
The second line contains <b><u>n</u></b> space-separated integers describing the colors <b><u>ar[i]</u></b> of the socks in the pile.

### Constraints
 - 1 <= n <= 100
 - 1 <= ar[i] <= 100 where 0 <= i <= n


### Output Format

Return the total number of matching pairs of socks that John can sell.

### Sample Input

9

10 20 20 10 10 30 50 10 20

### Sample Output

3

### Explanation

![sock.png](./readme_artifacts/sock.png )

John can match three pairs of socks.