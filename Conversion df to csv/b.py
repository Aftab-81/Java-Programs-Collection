import numpy as np
import pandas as pd
import requests
from io import BytesIO

url = 'https://docs.google.com/spreadsheets/d/1qT3j6TtRcAnAjuSaYzjsYVgpVVSSAa6-w9LV6HZfHzI/edit?usp=sharing'

response = requests.get(url)
response.raise_for_status()

df = pd.DataFrame(BytesIO(response.content))
print(df.head())