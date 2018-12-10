import pandas as pd
from scipy.stats import wilcoxon
from numpy import mean, std # version >= 1.7.1 && <= 1.9.1
from math import sqrt

# From http://stackoverflow.com/questions/21532471/how-to-calculate-cohens-d-in-python
def cohen_d(x,y):
  return (mean(x) - mean(y)) / sqrt((std(x, ddof=1) ** 2 + std(y, ddof=1) ** 2) / 2.0)


df = pd.read_csv('statisticsGOOD3.csv')

cat1 = df[df['configuration_id']=='Old']
print(cat1)
cat2 = df[df['configuration_id']=='New']
print(cat2)

for column in ['Score']:
  print ("%s: %.2f (%f)" % (column, cohen_d(cat1[column], cat2[column]), wilcoxon(cat1[column], cat2[column]).pvalue))