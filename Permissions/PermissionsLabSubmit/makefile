BASE_DIR = ..
EXERCISE_DIR = $(BASE_DIR)
TARGET_DIR = PermissionsLabSubmit
SUBMISSION_ZIP = PermissionsLabSubmit.zip

default: clean all

submission: clean all
	zip -r $(SUBMISSION_ZIP) $(TARGET_DIR)

all: permissions dangerous

permissions:
	mkdir -p $(TARGET_DIR)/Permissions
	cp $(EXERCISE_DIR)/Lab3b_PermissionsLab/AndroidManifest.xml $(TARGET_DIR)/Permissions/
	cp $(EXERCISE_DIR)/Lab3b_PermissionsLab/src/course/labs/permissionslab/ActivityLoaderActivity.java $(TARGET_DIR)/Permissions/
	cp $(EXERCISE_DIR)/Lab3b_PermissionsLab/src/course/labs/permissionslab/BookmarksActivity.java $(TARGET_DIR)/Permissions/
	cp $(EXERCISE_DIR)/Lab3b_PermissionsLab/src/course/labs/permissionslab/GoToDangerousActivity.java $(TARGET_DIR)/Permissions/

dangerous:
	mkdir -p $(TARGET_DIR)/Dangerous
	cp $(EXERCISE_DIR)/Lab3b_DangerousApp/AndroidManifest.xml $(TARGET_DIR)/Dangerous/

clean:
	rm -rf $(TARGET_DIR)
	rm -f $(SUBMISSION_ZIP)

