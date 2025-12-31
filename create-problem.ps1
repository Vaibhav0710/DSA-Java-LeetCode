param (
    [Parameter(Mandatory=$true)]
    [string]$ProblemName
)

# Ask for Problem Link
$ProblemLink = Read-Host "Enter Problem Link (LeetCode URL)"

# Get Topic List
$topicPaths = Get-ChildItem -Directory -Path "./src"

Write-Host "`nSelect Topic Folder:"
for ($i=0; $i -lt $topicPaths.Count; $i++) {
    Write-Host "$($i+1)) $($topicPaths[$i].Name)"
}

$choice = Read-Host "Enter number"
$selectedTopic = $topicPaths[$choice-1].FullName

$newFilePath = "$selectedTopic\$ProblemName.java"

# ==========================
# Create File with Boilerplate
# ==========================
@"
/**
 * Problem: $ProblemName
 * Platform: LeetCode
 * Link: $ProblemLink
 *
 * Approach:
 * -
 *
 * Time Complexity: O()
 * Space Complexity: O()
 */

import java.util.*;

public class $ProblemName {

    public static void main(String[] args) {
        // Optional Local Testing
    }

    // Solution Method
}
"@ | Set-Content $newFilePath

Write-Host "`nCreated Successfully:" -ForegroundColor Green
Write-Host $newFilePath
