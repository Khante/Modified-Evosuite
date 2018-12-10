import matplotlib.pyplot as plt
import pandas as pd

df = pd.read_csv('statisticsGOOD2.csv') # Make sure the path is correct

bp = df.boxplot(column='Score', by='configuration_id')
plt.show()