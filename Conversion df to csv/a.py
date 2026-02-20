import pandas as pd

# Step 1: Read CSV
##df = pd.read_csv('cardekho_imputated.csv')
print('Success')

# Step 2: Convert to Excel
##df.to_excel('output.xlsx', index=False)
print('Success2')

# Step 3: Read back the Excel file
df1 = pd.read_excel('output.xlsx')
print(df1.head())