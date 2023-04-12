PandasAssignment
Q1. How do you load a CSV file into a Pandas DataFrame?
we load a csv file with the help of read_csv function
df=read_csv('path of file')

Q2. How do you check the data type of a column in a Pandas DataFrame?
df.info() return complete details datatype ,missing values of all columns

Q3. How do you select rows from a Pandas DataFrame based on a condition?
df[df['Column1']>50]['Column1']  like this

Q4. How do you rename columns in a Pandas DataFrame?
df.rename()

Q5. How do you drop columns in a Pandas DataFrame?
df.drop(['column1','column2'],axis=1)

Q6. How do you find the unique values in a column of a Pandas DataFrame?
df.nunique()

Q7. How do you find the number of missing values in each column of a Pandas DataFrame?
df.isna().sum()

Q8. How do you fill missing values in a Pandas DataFrame with a specific value?
df.fillna('0')

Q9. How do you concatenate two Pandas DataFrames?
pd.concat((df1,df2),axis=1)

Q10. How do you merge two Pandas DataFrames on a specific column?
df.merge('column1','column2')

Q11. How do you group data in a Pandas DataFrame by a specific column and apply an aggregation function?
using groupby() to group then sum() count() etc aggregation functions

Q12. How do you pivot a Pandas DataFrame?
Using pivot() method

Q13. How do you change the data type of a column in a Pandas DataFrame?
df['column1']as_type(int)

Q14. How do you sort a Pandas DataFrame by a specific column?
df['column1'].sort_values()

Q15. How do you create a copy of a Pandas DataFrame?
dfnew=df.copy()

Q16. How do you filter rows of a Pandas DataFrame by multiple conditions?
Using & and | 
df[(df['column1']>50) & (df['column2']>300) | (df['column3']=0)]

Q17. How do you calculate the mean of a column in a Pandas DataFrame?
df['column1'].mean()

Q18. How do you calculate the standard deviation of a column in a Pandas DataFrame?
df['column1'].std()

Q19. How do you calculate the correlation between two columns in a Pandas DataFrame?
df['column1'].corr()

Q20. How do you select specific columns in a DataFrame using their labels?
df.loc[:,['column1','column2']]

Q21. How do you select specific rows in a DataFrame using their indexes?
using iloc
df.iloc[4,:]

Q22. How do you sort a DataFrame by a specific column?
df['column1'].sort_values()

Q23. How do you create a new column in a DataFrame based on the values of another column?
df['newcolumn']=df['column1']+df['column2']

Q24. How do you remove duplicates from a DataFrame?
df.drop_duplicates()

Q25. What is the difference between .loc and .iloc in Pandas?
loc is used for label-based indexing, while .iloc is used for positional indexing.




