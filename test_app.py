import time 
from selenium import webdriver 
from selenium.webdriver.chrome.options import Options 
options = Options() 
options.add_argument("--headless=new") 
options.add_argument("--no-sandbox") 
options.add_argument("--disable-dev-shm-usage") 
driver = webdriver.Chrome(options=options) 
try: 
    driver.get("file:///C:/CI_CD_Project/index.html") 
    print("Title:", driver.title) 
    assert driver.title != "" 
    print("SUCCESS") 
finally: 
    driver.quit() 
