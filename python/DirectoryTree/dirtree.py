import os

pathToUse = '/Users/liberdamj/repos/Cookbook/python'

for dirpath, dirs, files in os.walk(pathToUse):	 
	path = dirpath.split('/')
	print('|', (len(path))*'---', '[',os.path.basename(dirpath),']')
	for f in files:
		print('|', len(path)*'---', f)