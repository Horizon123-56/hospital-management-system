import time 
print("Step 1: Importing Selenium...") 
from selenium import webdriver 
from selenium.webdriver.chrome.options import Options 
print("Step 2: Configuring options...") 
options = Options() 
options.add_argument("--headless=new") 
options.add_argument("--no-sandbox") 
options.add_argument("--disable-dev-shm-usage") 
print("Step 3: Launching browser...") 
driver = webdriver.Chrome(options=options) 
print("Step 4: Opening webpage...") 
driver.get("file:///C:/CI_CD_Project/index.html") 
print("Title:", driver.title) 
assert driver.title != "" 
print("SUCCESS: Selenium test passed!") 
driver.quit() 
